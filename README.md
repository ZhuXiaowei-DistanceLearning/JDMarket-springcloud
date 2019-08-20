---
typora-root-url: read
---

# 基于SpringCloud的二手交易市场

## 1.项目简介

### 1.1 项目简介

- 是一个全品类的电商购物网站
- 用户可以购买商品、添加收藏、下单、发布闲置、上架、下架、擦亮
- 管理员可以监控所有商品的情况，以及一些数据统计的情况

### 1.2 系统架构

#### 1.2.1 系统架构图

![二手交易市场架构](https://github.com/502513206/JDMarket-springcloud/raw/master/README.assets/二手交易市场架构.png)

#### 1.2.2  系统架构解读

整个吉大二手交易市场分为两个个部分：后台管理系统、前台门户系统

- 后台管理
  - 商品管理
  - 用户管理
  - 订单管理
  -  文章管理
  - 统计
- 前台门户
  - 搜索商品
  - 添加收藏
  - 下单
  - 提问
  - 发布闲置
  - 上架、下架

- 集群共享
  - Eureka注册中心
  - Zuul网关服务
  - SpringCloudConfig配置中心

## 2.项目搭建

### 2.1 技术选型

前端技术：

- html+css+javascript(基于ES6)
- Vue.js 2.0以及基于Vue的UI框架:Vuetify
- 前端构建工具：Webpack
- 前端安装包工具：NPM
- Vue脚手架：Vue-cli
- Vue路由：vue-router
- ajax框架：axios
- 基于Vue的富文本框架：quill-editor

后端技术:

- 基础的SSM框架
- SpringBoot2.0
- SpringCloud Finchley.RC1
- Redis 3.0
- RabbitMQ-3.4
- Thymeleaf
- JWT

