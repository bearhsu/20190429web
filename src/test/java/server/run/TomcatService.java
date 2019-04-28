package server.run;
import java.io.File;

import org.apache.catalina.startup.Tomcat;


public class TomcatService {

	public static void main(String[] args) {
		String webappDirLocation = "src/main/webapp/";
		Tomcat tomcat = new Tomcat();
		tomcat.setPort(8081);
		tomcat.setBaseDir(new File("target").getAbsolutePath());
		try {
			tomcat.addWebapp("/", new File(webappDirLocation).getAbsolutePath());
			tomcat.start();
			tomcat.getServer().await();
		} catch (Exception e) {
		}

	}
}
