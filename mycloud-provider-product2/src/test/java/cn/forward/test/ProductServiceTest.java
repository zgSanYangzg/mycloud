package cn.forward.test;

import cn.forward.entity.Product;
import cn.forward.ProductApp2;
import cn.forward.service.IProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest(classes = ProductApp2.class)
@RunWith(SpringRunner.class)
public class ProductServiceTest {
    @Resource
    private IProductService iProductService;
    @Test
    public void testGet() {
        System.out.println(iProductService.get(1));
    }
    @Test
    public void testAdd() {
        Product dept = new Product() ;
        dept.setProductName("lison-" + System.currentTimeMillis());
        System.out.println(iProductService.add(dept));
    }
    @Test
    public void testList() {
        System.out.println(iProductService.list());
    }
}
