# 梦幻墟都博客

尽可能使用简单的方式动态管理文章并生成渲染静态页面进行相应

### 依赖库

#### 前端

图标库: [风车车呐](https://www.iconfont.cn/collections/detail?spm=a313x.7781069.1998910419.d9df05512&cid=42427)

Markdown Css: 使用[github-markdown-css](https://github.com/sindresorhus/github-markdown-css)样式

Pico.css: [GitHub](https://github.com/picocss/pico)

#### 后端

模板:Velocity

web框架:SpringBoot

Markdown处理: commonmark,每次保存文章后端将md转为html保存,避免了前端的每次加载转化,并且自带了草稿和发布两种状态

