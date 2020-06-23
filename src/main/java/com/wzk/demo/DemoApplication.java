package com.wzk.demo;

import com.wzk.demo.utils.QRCodeUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(DemoApplication.class, args);


        // 存放在二维码中的内容
        String text = "https://wangkarel.github.io/KarelTank/tankSolo.html";
        // 嵌入二维码的图片路径
        String imgPath = "D:\\wangzk\\wzk.jpg";
        // 生成的二维码的路径及名称
        String destPath = "D:\\wangzk\\code.jpg";
        //生成二维码
        QRCodeUtil.encode(text, imgPath, destPath, true);
        // 解析二维码
        String str = QRCodeUtil.decode(destPath);
        // 打印出解析出的内容
        System.out.println(str);

    }

}
