# Summary

第1章 Cloud Native 概述
 
1.1 当今软件发展的现状
 
1.1.1 软件需求的发展
 
1.1.2 开发方式的巨变
 
1.1.3 云是大势所趋
 
1.2 Cloud Native 的特性
 
1.2.1 以云为基础架构
 
1.2.2 云服务
 
1.2.3 无服务
 
1.2.4 可扩展
 
1.2.5 高可用
 
1.2.6 敏捷
 
1.2.7 云优先
 
1.3 12-Factor
 
1.3.1 基准代码
 
1.3.2 依赖
 
1.3.3 配置
 
1.3.4 后端服务
 
1.3.5 构建、发布和运行
 
1.3.6 进程
 
1.3.7 端口绑定
 
1.3.8 并发
 
1.3.9 易处理
 
1.3.10 开发环境与线上环境等价
 
1.3.11 日志
 
1.3.12 管理进程
 
1.4 成功案例
 
1.4.1 Amazon
 
1.4.2    Netflix
 
1.4.3 淘宝网
 
1.5 Cloud Native 与微服务
 
1.5.1 微服务概述
 
1.5.2 从单块架构向微服务演进
 
1.5.3 Cloud Native 与微服务部署
 
1.6 总结
 
1.6.1 Cloud Native 的优点
 
1.6.2 Cloud Native 不是“银弹”
 
1.6.3 面临的挑战
 
第2章 REST API
 
2.1 REST 概述
 
2.1.1 REST 的定义
 
2.1.2 REST 设计原则
 
2.2 成熟度模型
 
2.2.1 第0级：使用 HTTP 作为传输方式
 
2.2.2 第1级：引入了资源的概念
 
2.2.3 第2级：根据语义使用 HTTP 动词
 
2.2.4 第3级：使用 HATEOAS
 
2.3 Java REST
 
2.3.1 JAX-RS 规范
 
2.3.2 Jersey 框架
 
2.3.3 Apache CXF 框架
 
2.3.4 Spring Web MVC 框架
 
2.4 内容协商
 
2.4.1 二进制数据
 
2.4.2 Google Protocol Buffers 传输协议
 
2.5 异常处理
 
2.5.1 HTTP 状态码
 
2.5.2 自定义异常信息
 
2.6 API 管理
 
2.6.1 版本化
 
2.6.2 文档化
 
2.6.3 可视化
 
2.7 客户端 

2.7.1 浏览器插件
 
2.7.2 JAX-RS 客户端
 
2.7.3 Spring 客户端
 
2.8 实战：开启第一个微服务
 
2.8.1 初始化一个 Spring Boot 原型
 
2.8.2 用 Gradle 编译项目
 
2.8.3 探索项目
 
2.8.4 实现第一个服务
 
第3章 Cloud Native 测试
 
3.1 测试概述
 
3.1.1 传统测试所面临的问题
 
3.1.2 如何破解测试面临的问题
 
3.2 测试的类型、范围和比例
 
3.2.1 测试类型
 
3.2.2 测试范围
 
3.2.3 测试比例
 
3.3 如何进行微服务的测试
 
3.3.1 微服务的单元测试
 
3.3.2 Mock 与 Stub 的区别
 
3.3.3 微服务的集成测试
 
3.3.4 微服务的系统测试
 
3.3.5 保障代码覆盖率
 
3.4 Spring 测试框架
 
3.4.1 Spring TestContext 框架
 
3.4.2 Spring MVC Test 框架
 
3.4.3 Spring Boot Test 框架
 
第4章 服务路由
 
4.1 如何找到服务
 
4.1.1 DNS 

4.1.2 服务注册与发现
 
4.1.3 客户端发现机制
 
4.1.4 服务端发现机制
 
4.2 实战：实现服务注册与发现
 
4.2.1 选择 Eureka的原因
 
4.2.2 集成 Eureka Server
 
4.2.3 集成 Eureka Client
 
4.2.4 服务的注册与发现
 
第5章 Cloud Native 安全
 
5.1 认证与授权
 
5.1.1 基本认证
 
5.1.2 摘要认证 

5.1.3 摘要认证的密码加密
 
5.1.4 通用密码加密
 
5.1.5 基于散列的令牌方法 

5.1.6 基于持久化的令牌方法 

5.2 Java 安全框架 

5.2.1 Apache Shiro 

5.2.2 Spring Security
 
5.2.3 Spring Cloud Security 

5.3 OAuth 2.0 认证
 
5.3.1 OAuth 2.0 的认证原理 

5.3.2 OAuth 2.0 的核心概念
 
5.3.3 OAuth 2.0 的认证流程
 
5.4 实战：实现单点登录
 
5.4.1 项目依赖
 
5.4.2 编码实现 

5.4.3 应用配置
 
5.4.4 运行
 
第6章 Cloud Native 数据管理 

6.1 数据的存储方式 

6.1.1 关系型数据库
 
6.1.2 NoSQL 

6.2 DDD 与数据建模
 
6.2.1 DDD 概述
 
6.2.2 运用 DDD 进行数据建模
 
6.3 常用数据访问方式 

6.3.1 JDBC 

6.3.2 Spring JDBC 

6.3.3 JPA 

6.4 Spring Data 

6.4.1 Spring Data 概述 

6.4.2 Spring Data JPA 

6.4.3 Spring Data Elasticsearch 

6.4.4 Spring Data Redis 

6.4.5 Spring Data MongoDB 

6.4.6 实战：基于 MongoDB 的文件服务器 

第7章 Cloud Native 消息通信 

7.1 消息通信概述 

7.1.1 消息通信的基本概念 

7.1.2 JMS 

7.1.3 事件驱动的架构 

7.2 消息通信常用模式
 
7.2.1 点对点模式 

7.2.2 发布—订阅模式
 
7.3 CQRS 

7.3.1 CQRS 概述 

7.3.2 CQRS 的好处 

7.3.3 实战：实现 CQRS 

7.4 Spring Cloud Stream 

7.4.1 Spring Cloud Stream 概述 

7.4.2 Spring Cloud Stream 实现发布者 

7.4.3 Spring Cloud Stream 实现消费者 

7.4.4 实战：基于 Spring Cloud Stream 的消息通信 

第8章 Cloud Native 批处理 

8.1 批处理概述 

8.1.1 需要批处理的原因 

8.1.2 常用批处理实现方式 

8.2 JDBC Batch 

8.2.1 Statement 与 PreparedStatement 

8.2.2 实战：使用 JDBC Batch 的例子 

8.3 Spring 批处理 

8.3.1 使用 JdbcTemplate 实现批处理 

8.3.2 批量更新 List 

8.3.3 多个批次更新 

8.4 Spring Batch 

8.4.1 Spring Batch 概述 

8.4.2 Job 

8.4.3 JobLauncher 

8.4.4 JobRepository 

8.4.5 Step 

8.4.6 ItemReader 

8.4.7 ItemWriter 

8.4.8 ItemProcessor 

8.4.9 实战：使用 Spring Batch 的例子 

第9章 Cloud Native 任务调度 

9.1 任务执行与调度概述 

9.2 Spring TaskExecutor 

9.2.1 TaskExecutor 类型 

9.2.2 TaskExecutor 应用 

9.3 Spring TaskScheduler 

9.3.1 Trigger 接口 

9.3.2 Trigger 接口的实现 

9.4 Spring 任务调度及异步执行 

9.4.1 启用调度注解 

9.4.2 @Scheduled 注解 

9.4.3 @Async 注解 

9.4.4 @Async 的异常处理 

9.4.5 命名空间 

9.5 使用 Quartz Scheduler 

9.5.1 使用 JobDetailFactoryBean 

9.5.2 使用 MethodInvokingJobDetailFactoryBean 

9.6 实战：基于 Quartz Schedule 的天气预报系统 

9.6.1 项目概述 

9.6.2 后台编码实现 

9.6.3 运行 

第10章 Cloud Native 运营 

10.1 CAP 理论 

10.1.1 CAP 理论概述 

10.1.2 CAP 只能三选二的原因 

10.1.3 CAP 常见模型 

10.1.4 CAP 的意义 

10.1.5 CAP 的发展 

10.2 服务的熔断 

10.2.1 熔断的意义 

10.2.2 Hystrix 概述 

10.2.3 实战：实现微服务的熔断机制 

10.3 代码管理 

10.3.1 Git 简介 

10.3.2 Git 核心概念 

10.3.3 Git Flow 

10.4 日志管理 

10.4.1 日志框架概述 

10.4.2 分布式下的日志管理 

10.4.3 集中化日志分析 

10.4.4 实战：基于 Elastic Stack 的集中化日志管理 

10.5 配置管理 

10.5.1 分布式下的配置管理的痛点 

10.5.2 集中化配置 

10.5.3  Spring Cloud Config 

10.5.4 实战：基于 Config 实现的配置中心 

10.6 应用监控 

10.6.1 心跳 

10.6.2 Eureka 监测机制 

10.6.3 Spring Boot Actuator 

10.6.4 实战：基于 Spring Boot Actuator 监测的例子 

第11章 Cloud Native 持续发布 

11.1 持续集成与持续交付 

11.1.1 持续集成概述 

11.1.2 持续交付与持续部署 

11.1.3 持续交付与持续部署的意义 

11.2 持续交付流水线 

11.2.1 流水线概述 

11.2.2 构建持续交付流水线 

11.2.3 构建流水线的工具 

11.3 微服务的管理与发布 

11.3.1 两个比萨的故事 

11.3.2 DevOps 文化 

11.3.3 微服务的发布 

11.4 容器 

11.4.1 虚拟化技术 

11.4.2 容器与虚拟机 

11.4.3 基于容器的持续部署流程 

11.4.4 实战：使用 Docker 来构建、运行和发布微服务 

11.5 发布到云 

11.5.1 常用云服务 

11.5.2 实战：发布应用到云 

附录 本书所涉及的技术及相关版本 

参考文献