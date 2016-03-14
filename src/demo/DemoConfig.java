package demo;

import com.jfinal.config.*;
import com.jfinal.core.JFinal;

public class DemoConfig extends JFinalConfig {
	public void configConstant(Constants me) {
		me.setDevMode(true);
	}

	public void configRoute(Routes me) {
		me.add("/", HelloController.class);//最好设定有建根路径
		me.add("/hello", HelloController.class);//访问地址要注意不要漏掉端口号或者填错端口号，jetty和tomcat有一个好像可以不写端口号
	}

	public void configPlugin(Plugins me) {
	}

	public void configInterceptor(Interceptors me) {
	}

	public void configHandler(Handlers me) {
	}
	
//	public static void main(String[] args) {
//		JFinal.start("src/main/webapp", 80, "/", 5);
//	}
}