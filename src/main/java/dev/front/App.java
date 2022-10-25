package dev.front;

import cn.hutool.http.HttpUtil;
import cn.hutool.http.server.action.RootAction;

public class App {
	final static String root = "D:\\Code\\java\\dream_blog\\src\\main\\resources\\templates";
	final static String staticPath = "D:\\Code\\java\\dream_blog\\src\\main\\resources";

	public static void main(String[] args) {
		HttpUtil.createServer(80)
		        .setRoot(root)
		        .addAction("/static", (req, res) -> new RootAction(staticPath).doAction(req, res))
		        .start();
	}
}
