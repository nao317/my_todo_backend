# my_todo_backend
今回作成するTodoのバックエンド

# 実行・ビルド等のDockerコマンド

Dockerを操作する際に必要なコマンドをここにメモする。

## Dockerへのログイン・ログアウト

- ログイン
```bash
docker login
```

- ログアウト
```bash
docker logout
```

## ビルド

```bash
docker build -t my-todo-backend .
```

## 実行

```bash
docker run -p 8080:8080 my-todo-backend
```