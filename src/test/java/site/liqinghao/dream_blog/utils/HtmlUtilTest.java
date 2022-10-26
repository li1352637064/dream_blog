package site.liqinghao.dream_blog.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HtmlUtilTest {
	final String markdown = "# 欢迎使用 Markdown在线编辑器\n" +
	                        "\n" +
	                        "**Markdown是一种轻量级的「标记语言」**\n" +
	                        "\n" +
	                        "> Markdown是一种可以使用普通文本编辑器编写的标记语言，通过简单的标记语法，它可以使普通文本内容具有一定的格式。它允许人们使用易读易写的纯文本格式编写文档，然后转换成格式丰富的HTML页面，Markdown文件的后缀名便是“.md”\n" +
	                        "\n" +
	                        "## MdEditor的功能列表演示\n" +
	                        "\n" +
	                        "# 标题H1\n" +
	                        "## 标题H2\n" +
	                        "### 标题H3\n" +
	                        "#### 标题H4\n" +
	                        "##### 标题H5\n" +
	                        "###### 标题H5\n" +
	                        "### 字符效果和横线等\n" +
	                        "----\n" +
	                        "\n" +
	                        "~~删除线~~ <s>删除线（开启识别HTML标签时）</s>\n" +
	                        "\n" +
	                        "*斜体字*      _斜体字_\n" +
	                        "\n" +
	                        "**粗体**  __粗体__\n" +
	                        "\n" +
	                        "***粗斜体*** ___粗斜体___\n" +
	                        "\n" +
	                        "上标：X<sub>2</sub>，下标：O<sup>2</sup>\n" +
	                        "\n" +
	                        "**缩写(同HTML的abbr标签)**\n" +
	                        "\n" +
	                        "> 即更长的单词或短语的缩写形式，前提是开启识别HTML标签时，已默认开启\n" +
	                        "\n" +
	                        "The <abbr title=\"Hyper Text Markup Language\">HTML</abbr> specification is maintained by the <abbr title=\"World Wide Web Consortium\">W3C</abbr>.\n" +
	                        "### 引用 Blockquotes\n" +
	                        "\n" +
	                        "> 引用文本 Blockquotes\n" +
	                        "\n" +
	                        "引用的行内混合 Blockquotes\n" +
	                        "\n" +
	                        "> 引用：如果想要插入空白换行`即<br />标签`，在插入处先键入两个以上的空格然后回车即可，[普通链接](https://www.mdeditor.com/)。\n" +
	                        "\n" +
	                        "### 锚点与链接 Links\n" +
	                        "[普通链接](https://www.mdeditor.com/)\n" +
	                        "[普通链接带标题](https://www.mdeditor.com/ \"普通链接带标题\")\n" +
	                        "直接链接：<https://www.mdeditor.com>\n" +
	                        "[锚点链接][anchor-id]\n" +
	                        "[anchor-id]: https://www.mdeditor.com/\n" +
	                        "[mailto:test.test@gmail.com](mailto:test.test@gmail.com)\n" +
	                        "GFM a-tail link @pandao\n" +
	                        "邮箱地址自动链接 test.test@gmail.com  www@vip.qq.com\n" +
	                        "> @pandao\n" +
	                        "\n" +
	                        "### 多语言代码高亮 Codes\n" +
	                        "\n" +
	                        "#### 行内代码 Inline code\n" +
	                        "\n" +
	                        "\n" +
	                        "执行命令：`npm install marked`\n" +
	                        "\n" +
	                        "\n" +
	                        "#### JS代码\n" +
	                        "```javascript\n" +
	                        "function test() {\n" +
	                        "\tconsole.log(\"Hello world!\");\n" +
	                        "}\n" +
	                        "```\n" +
	                        "\n" +
	                        "#### HTML 代码 HTML codes\n" +
	                        "```html\n" +
	                        "<!DOCTYPE html>\n" +
	                        "<html>\n" +
	                        "    <head>\n" +
	                        "        <mate charest=\"utf-8\" />\n" +
	                        "        <meta name=\"keywords\" content=\"Editor.md, Markdown, Editor\" />\n" +
	                        "        <title>Hello world!</title>\n" +
	                        "        <style type=\"text/css\">\n" +
	                        "            body{font-size:14px;color:#444;font-family: \"Microsoft Yahei\", Tahoma, \"Hiragino Sans GB\", Arial;background:#fff;}\n" +
	                        "            ul{list-style: none;}\n" +
	                        "            img{border:none;vertical-align: middle;}\n" +
	                        "        </style>\n" +
	                        "    </head>\n" +
	                        "    <body>\n" +
	                        "        <h1 class=\"text-xxl\">Hello world!</h1>\n" +
	                        "        <p class=\"text-green\">Plain text</p>\n" +
	                        "    </body>\n" +
	                        "</html>\n" +
	                        "```\n" +
	                        "### 图片 Images\n" +
	                        "\n" +
	                        "图片加链接 (Image + Link)：\n" +
	                        "\n" +
	                        "\n" +
	                        "![](https://www.baidu.com/img/bd_logo1.png \"markdown\")\n" +
	                        "\n" +
	                        "> Follow your heart.\n" +
	                        "\n" +
	                        "----\n" +
	                        "### 列表 Lists\n" +
	                        "\n" +
	                        "#### 无序列表（减号）Unordered Lists (-)\n" +
	                        "\n" +
	                        "- 列表一\n" +
	                        "- 列表二\n" +
	                        "- 列表三\n" +
	                        "\n" +
	                        "#### 无序列表（星号）Unordered Lists (*)\n" +
	                        "\n" +
	                        "* 列表一\n" +
	                        "* 列表二\n" +
	                        "* 列表三\n" +
	                        "\n" +
	                        "#### 无序列表（加号和嵌套）Unordered Lists (+)\n" +
	                        "+ 列表一\n" +
	                        "+ 列表二\n" +
	                        "    + 列表二-1\n" +
	                        "    + 列表二-2\n" +
	                        "    + 列表二-3\n" +
	                        "+ 列表三\n" +
	                        "    * 列表一\n" +
	                        "    * 列表二\n" +
	                        "    * 列表三\n" +
	                        "\n" +
	                        "#### 有序列表 Ordered Lists (-)\n" +
	                        "\n" +
	                        "1. 第一行\n" +
	                        "2. 第二行\n" +
	                        "3. 第三行\n" +
	                        "\n" +
	                        "----\n" +
	                        "\n" +
	                        "### 绘制表格 Tables\n" +
	                        "\n" +
	                        "| 项目        | 价格   |  数量  |\n" +
	                        "| --------   | -----:  | :----:  |\n" +
	                        "| 计算机      | $1600   |   5     |\n" +
	                        "| 手机        |   $12   |   12   |\n" +
	                        "| 管线        |    $1    |  234  |\n" +
	                        "\n" +
	                        "\n" +
	                        "First Header  | Second Header\n" +
	                        "------------- | -------------\n" +
	                        "Content Cell  | Content Cell\n" +
	                        "Content Cell  | Content Cell\n" +
	                        "\n" +
	                        "\n" +
	                        "| First Header  | Second Header |\n" +
	                        "| ------------- | ------------- |\n" +
	                        "| Content Cell  | Content Cell  |\n" +
	                        "| Content Cell  | Content Cell  |\n" +
	                        "\n" +
	                        "| Function name | Description                    |\n" +
	                        "| ------------- | ------------------------------ |\n" +
	                        "| `help()`      | Display the help window.       |\n" +
	                        "| `destroy()`   | **Destroy your computer!**     |\n" +
	                        "\n" +
	                        "| Left-Aligned  | Center Aligned  | Right Aligned |\n" +
	                        "| :------------ |:---------------:| -----:|\n" +
	                        "| col 3 is      | some wordy text | $1600 |\n" +
	                        "| col 2 is      | centered        |   $12 |\n" +
	                        "| zebra stripes | are neat        |    $1 |\n" +
	                        "\n" +
	                        "| Item      | Value |\n" +
	                        "| --------- | -----:|\n" +
	                        "| Computer  | $1600 |\n" +
	                        "| Phone     |   $12 |\n" +
	                        "| Pipe      |    $1 |\n" +
	                        "\n";

	@Test
	void m2h() {
		final String html = HtmlUtil.m2h(markdown);
		System.out.println("html = " + html);
	}
	@Test
	void m2hEx() {
		final String html = HtmlUtil.m2hEx(markdown);
		System.out.println("html = " + html);
	}
}