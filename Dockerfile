# ---- Build Stage ----
FROM gradle:8.5-jdk17 AS build
WORKDIR /app

# キャッシュ活用のため、先にgradle wrapperとビルドファイルだけコピー
COPY gradlew build.gradle settings.gradle /app/
COPY gradle /app/gradle/

# 依存解決（キャッシュ効く）
RUN ./gradlew dependencies

# 残りのコードをコピー
COPY . /app

# ビルド（bootJar）
RUN ./gradlew bootJar --no-daemon

# ---- Run Stage ----
FROM openjdk:17-jdk-slim
WORKDIR /app

# jarをコピー（wildcardでOK）
COPY --from=build /app/build/libs/*.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
