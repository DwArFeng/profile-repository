# ChangeLog

### Release_1.1.0_20230620_build_A

#### 功能构建

- 启停脚本优化。
  - 优化 Windows 系统的启动脚本。
  - 优化 Linux 系统的启停脚本。

- 优化项目结构，增加项目目录。
  - `./confext/`。
  - `./libext/`。
  - `./opt/`。
  - `./optext/`。

- 引入 `spring-telqos` 提供 telnet 运维平台。

- 使用 `spring-terminator` 重构项目的启停机制。

- 使用 `MapStruct` 重构 `BeanTransformer`。

- 插件升级。
  - 升级 `maven-deploy-plugin` 插件版本为 `2.8.2`。

- 增加依赖。
  - 增加依赖 `javassist` 以规避漏洞，版本为 `3.23.2-GA`。
  - 增加依赖 `protobuf` 以规避漏洞，版本为 `3.19.6`。
  - 增加依赖 `guava` 以规避漏洞，版本为 `32.0.1-jre`。
  - 增加依赖 `gson` 以规避漏洞，版本为 `2.8.9`。
  - 增加依赖 `snakeyaml` 以规避漏洞，版本为 `2.0`。
  - 增加依赖 `slf4j` 以应用其功能，版本为 `1.7.5`。
  - 增加依赖 `jboss-logging` 以应用其功能，版本为 `3.4.3.Final`。
  - 增加依赖 `spring-terminator` 以应用其功能，版本为 `1.0.11.a`。
  - 增加依赖 `spring-telqos` 以应用其功能，版本为 `1.1.6.a`。

- 依赖升级。
  - 升级 `junit` 依赖版本为 `4.13.2` 以规避漏洞。
  - 升级 `spring` 依赖版本为 `5.3.27` 以规避漏洞。
  - 升级 `mysql` 依赖版本为 `8.0.31` 以规避漏洞。
  - 升级 `fastjson` 依赖版本为 `1.2.83` 以规避漏洞。
  - 升级 `druid` 依赖版本为 `1.1.20` 以规避漏洞。
  - 升级 `jedis` 依赖版本为 `3.8.0` 以规避漏洞。
  - 升级 `spring-data-redis` 依赖版本为 `2.7.5` 以规避漏洞。
  - 升级 `dubbo` 依赖版本为 `2.7.22` 以规避漏洞。
  - 升级 `netty` 依赖版本为 `4.1.86` 以规避漏洞。
  - 升级 `zookeeper` 依赖版本为 `3.5.7` 以规避漏洞。
  - 升级 `curator` 依赖版本为 `4.3.0` 以规避漏洞。
  - 升级 `hibernate` 依赖版本为 `5.4.24.Final` 以规避漏洞。
  - 升级 `hibernate-validator` 依赖版本为 `6.2.5.Final` 以规避漏洞。
  - 升级 `log4j2` 依赖版本为 `2.17.2` 以规避漏洞。
  - 升级 `dutil` 依赖版本为 `beta-0.3.2.a` 以规避漏洞。
  - 升级 `subgrade` 依赖版本为 `1.3.3.a` 以规避漏洞。

- 优化配置文件。
  - 优化 `application-context-xxx.xml`，使得更多属性可以在配置文件中配置。

- 优化文件格式。
  - 优化 `pom.xml` 文件的格式。
  - 优化 `application-context-xxx.xml` 文件的格式。

#### Bug修复

- 修复 HibernateProfile 数据库字段名与关键字冲突的问题。

#### 功能移除

- 删除不需要的依赖。
  - 删除 `joda-time` 依赖。
  - 删除 `commons-lang3` 依赖。
  - 删除 `commons-io` 依赖。
  - 删除 `commons-net` 依赖。
  - 删除 `pagehelper` 依赖。
  - 删除 `jsqlparser` 依赖。
  - 删除 `commons-fileupload` 依赖。
  - 删除 `solrj` 依赖。
  - 删除 `httpcomponents` 依赖。
  - 删除 `aopalliance` 依赖。
  - 删除 `el` 依赖。
  - 删除 `zkclient` 依赖。
  - 删除 `noggit` 依赖。

---

### Release_1.0.0_20200203_build_B

#### 功能构建

- ProfileService更名为ProfileMaintainService。

#### Bug修复

- (无)

#### 功能移除

- (无)

---

### Release_1.0.0_20200203_build_A

#### 功能构建

- 工程全目标实现。

#### Bug修复

- (无)

#### 功能移除

- (无)
