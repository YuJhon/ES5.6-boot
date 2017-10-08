## Spring Boot + ElasticSearch 5.6.2 实现基础的CRUD功能

### Elasticsearch安装步骤[单机版本]
#### 下载Elasticsearch 的Head 插件，然后进行安装
#### 首先检查一下node的版本是否在 6.0以上
![Elasticsearch Head插件安装](./src/main/resources/static/2017-10-03_201242.png)
``` bash
node -v
npm install
```
#### 依赖安装完成之后，启动head插件
![Elasticsearch Head插件安装](./src/main/resources/static/2017-10-03_202126.png)
``` bash
npm run start
```
#### 修改Elasticsearch的配置文件，解决head集成的跨域问题
``` yml
http.cors.enabled: true
http.cors.allow-origin: *.*
```
![Elasticsearch Head插件安装](./src/main/resources/static/2017-10-03_202451.png)

#### 启动Elasticsearch 
![Elasticsearch Head插件安装](./src/main/resources/static/2017-10-03_202547.png)

#### 使用head插件查看界面
![Elasticsearch Head插件安装](./src/main/resources/static/2017-10-03_202719.png)

### ElasticSearch 分布式安装配置
#### Master配置
``` yml

```
![Elasticsearch Head插件安装](./src/main/resources/static/2017-10-03_203148.png)

#### 浏览器打开查看 Master配置信息
![Elasticsearch Head插件安装](./src/main/resources/static/2017-10-03_203249.png)

![Elasticsearch Head插件安装](./src/main/resources/static/2017-10-03_203311.png)

#### Salve01配置
``` yml
cluster.name: JhonRain
node.name: slave1

network.host: 127.0.0.1
http.port: 8200

# 配置找到Master
discovery.zen.ping.unicast.hosts: ["127.0.0.1"]
```
![Elasticsearch Head插件安装](./src/main/resources/static/2017-10-03_204405.png)
#### Salve02配置
``` yml
cluster.name: JhonRain
node.name: slave2

network.host: 127.0.0.1
http.port: 7200

# 配置找到Master
discovery.zen.ping.unicast.hosts: ["127.0.0.1"]
```
![Elasticsearch Head插件安装](./src/main/resources/static/2017-10-03_204347.png)

#### 分别启动Master和Slave，如下
![Elasticsearch Head插件安装](./src/main/resources/static/Master-with-slave.png)

##### 使用浏览器查看是否存在
![Elasticsearch Head插件安装](./src/main/resources/static/2017-10-03_204944.png)


#### 索引的创建 和 查看编辑信息
![Elasticsearch Head插件安装](./src/main/resources/static/2017-10-03_205506.png)

![Elasticsearch Head插件安装](./src/main/resources/static/2017-10-03_205542.png)

![Elasticsearch Head插件安装](./src/main/resources/static/2017-10-03_205614.png)

![Elasticsearch Head插件安装](./src/main/resources/static/2017-10-03_205713.png)

![Elasticsearch Head插件安装](./src/main/resources/static/2017-10-03_205756.png)

![Elasticsearch Head插件安装](./src/main/resources/static/2017-10-03_210117.png)

![Elasticsearch Head插件安装](./src/main/resources/static/2017-10-03_210205.png)

![Elasticsearch Head插件安装](./src/main/resources/static/2017-10-03_210237.png)

#### Restful 接口调用格式示例[借助postman]
![Elasticsearch Head插件安装](./src/main/resources/static/2017-10-03_205410.png)

![Elasticsearch Head插件安装](./src/main/resources/static/2017-10-03_212938.png)

![Elasticsearch Head插件安装](./src/main/resources/static/2017-10-03_213025.png)

![Elasticsearch Head插件安装](./src/main/resources/static/2017-10-03_213114.png)

![Elasticsearch Head插件安装](./src/main/resources/static/2017-10-03_213630.png)

![Elasticsearch Head插件安装](./src/main/resources/static/2017-10-03_213818.png)

![Elasticsearch Head插件安装](./src/main/resources/static/2017-10-03_214111.png)

![Elasticsearch Head插件安装](./src/main/resources/static/2017-10-03_214143.png)

![Elasticsearch Head插件安装](./src/main/resources/static/2017-10-03_214354.png)

![Elasticsearch Head插件安装](./src/main/resources/static/2017-10-03_214427.png)

![Elasticsearch Head插件安装](./src/main/resources/static/2017-10-03_214559.png)

![Elasticsearch Head插件安装](./src/main/resources/static/2017-10-03_214621.png)

![Elasticsearch Head插件安装](./src/main/resources/static/2017-10-03_214812.png)

![Elasticsearch Head插件安装](./src/main/resources/static/2017-10-03_214830.png)

![Elasticsearch Head插件安装](./src/main/resources/static/2017-10-03_214921.png)

![Elasticsearch Head插件安装](./src/main/resources/static/2017-10-03_214951.png)

![Elasticsearch Head插件安装](./src/main/resources/static/2017-10-03_215014.png)

![Elasticsearch Head插件安装](./src/main/resources/static/2017-10-03_215324.png)

![Elasticsearch Head插件安装](./src/main/resources/static/2017-10-03_220233.png)

![Elasticsearch Head插件安装](./src/main/resources/static/2017-10-04_091444.png)

![Elasticsearch Head插件安装](./src/main/resources/static/2017-10-04_092754.png)

![Elasticsearch Head插件安装](./src/main/resources/static/2017-10-04_092823.png)

![Elasticsearch Head插件安装](./src/main/resources/static/2017-10-04_094557.png)

![Elasticsearch Head插件安装](./src/main/resources/static/2017-10-04_095817.png)

![Elasticsearch Head插件安装](./src/main/resources/static/2017-10-04_095830.png)

![Elasticsearch Head插件安装](./src/main/resources/static/ES_Search.png)

