# spring-boot-web-notes
spring-boot 从 0 - 1 以及各 web 运用的创建记录

## 技术内容
- **spring-boot**

- **mybatis & flyway**

### 数据库迁移

#### 数据初始化
```java
mvn flyway:migrate
```

#### 数据库清除
```java
mvn flyway:clean
```

[代码编写过程参考](https://github.com/mushanwb/casual_write/issues/18)

