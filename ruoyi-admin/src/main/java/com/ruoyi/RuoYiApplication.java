package com.ruoyi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * 启动程序
 * 
 * @author ruoyi
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@ComponentScan({"com.ruoyi.*", "com.jingyuan.*"})
@MapperScan("com.jingyuan.**.mapper")
public class RuoYiApplication
{
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(RuoYiApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  项目启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                "   ██ ██                  ██                        \n" +
                "   ░░ ░░            █████ ░██                        \n" +
                "    ██ ██ ███████  ██░░░██░██       ██████    ██████ \n" +
                "   ░██░██░░██░░░██░██  ░██░██████  ░░░░░░██  ██░░░░██\n" +
                "   ░██░██ ░██  ░██░░██████░██░░░██  ███████ ░██   ░██\n" +
                " ██░██░██ ░██  ░██ ░░░░░██░██  ░██ ██░░░░██ ░██   ░██\n" +
                "░░███ ░██ ███  ░██  █████ ░██  ░██░░████████░░██████ \n" +
                " ░░░  ░░ ░░░   ░░  ░░░░░  ░░   ░░  ░░░░░░░░  ░░░░░░  ");
    }
}