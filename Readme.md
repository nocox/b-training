# BTraining

## 環境構築
### Docker
初回のみ
```shell script
cd bt-docker
docker-compose up -d
```

通常時
```shell script
cd bt-docker
docker-compose start
```

状態確認
```shell script
docker ps
```
```shell script
CONTAINER ID        IMAGE               COMMAND                  CREATED             STATUS              PORTS                               NAMES
d5a6af7827cd        mysql:8.0.16        "docker-entrypoint.s…"   13 days ago         Up 5 hours          0.0.0.0:3306->3306/tcp, 33060/tcp   bt-mysql
```


### DB接続

#### Intellijに環境変数を設定

まず設定する環境変数を準備．(以下は仮の環境，各自の環境に合わせてください)
```shell script
BT_DB_URL=jdbc:mysql://127.0.0.1:3306/btraining?sslMode=DISABLED
BT_DB_USERNAME=btraining_user
BT_DB_PASSWORD=btraining_pass
```

上記の形式で揃えた環境変数をクリップボードにコピーする．

その後．環境変数をIntellijに設定します．以下の順序で設定場所に遷移．
> Edit Configurations... > Environment > Environment variables

![image](https://user-images.githubusercontent.com/50159106/79681845-8054de80-8258-11ea-83a2-62683b84aca9.png)

![image](https://user-images.githubusercontent.com/50159106/79681817-1e947480-8258-11ea-8b91-3118960462ec.png)

このボタンを押すとクリップボード内の環境変数を貼り付けられる．
![image](https://user-images.githubusercontent.com/50159106/79681821-281ddc80-8258-11ea-8562-4d4b9f11682d.png)




