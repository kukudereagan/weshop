package tech.wetech.weshop.admin;

import org.springframework.boot.SpringApplication;
import tech.wetech.weshop.common.annotations.WeshopSpringCloudApplication;

/**
 * @author cjbi@outlook.com
 */
@WeshopSpringCloudApplication
public class WeshopAdminApplication {

    public static void main(String[] args) {
        System.out.println(111);
        SpringApplication.run(WeshopAdminApplication.class, args);
    }

}
