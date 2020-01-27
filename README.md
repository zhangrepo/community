
## 我的社区

[演示](localhost:8887)

![](https://ws1.sinaimg.cn/large/007xSFjzly1g6a18juzhnj30ku08cn6i.jpg)

## 介绍
controller ：

dto:在类与类之间，网络之间数据传输的模型

mapper:对数据库进行数据持久化操作，他的方法语句是直接针对数据库操作的

provider:提供对第三方支持的能力

model:用于存放我们的实体类，与数据库中的属性值基本保持一致。

## 资料

[Spring 文档](https://spring.io/guides)

[Spring Web](https://spring.io/guides/gs/serving-web-content/)

[es](https://elasticsearch.cn/explore)

[Github deploy key](https://developer.github.com/v3/guides/managing-deploy-leys/#deploy-keys)

[Bootstrap]( https://v3.bootcss.com/getting-started)

[Github OAuth]( https://developer.github.com/apps/building-oauth-apps/creating-an-oauth-app/)

## 工具

[Git]( https://git-scm.com/download)  

[Visual Paradigm](https://www.visual-paradigm.com)  
 
[Flyway](https://flywaydb.org/getstarted/firststeps/maven)

[lombok](https://www.projectlombok.org)

[Thymeleaf](https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html#setting-attribute-values)
## 脚本
```sql
CREATE TABLE USER(
    ID INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    ACCOUNT_ID VARCHAR(100),
    NAME VARCHAR(50),
    TOKEN CHAR(36),
    GMT_CREATE BIGINT,
    GMT_MODIFIED BIGINT
);


```
```sql
alter table USER add bio varchar(256) null;

```
```sql
create table question
(
	id int auto_increment,
	title varchar(50),
	description text,
	gmt_create bigint,
	gmt_modified bigint,
	creator int,
	comment_count int default 0,
	view_count int default 0,
	like_count int default 0,
	tag varchar(256),
	constraint question_pk
		primary key (id)
);



```
```sql
alter table USER add avatar_url varchar(100);
```
```bash
mvn flyway:migrate
```
## 存在的问题

1.给一段时间发布问题后在数据库中产生的creator不一样，所以我的问题只显示了最近发布的问题


