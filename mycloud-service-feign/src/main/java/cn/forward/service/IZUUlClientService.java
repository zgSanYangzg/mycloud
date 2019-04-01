package cn.forward.service;

import cn.forward.entity.Product;
import cn.forward.entity.vo.Users;
import cn.forward.fallback.IZUUlClientServiceallbackFactory;
import cn.forward.feign.FeignClientConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "MYCLOUD-ZUUL-GATEWAY",configuration = FeignClientConfig.class,
        fallbackFactory = IZUUlClientServiceallbackFactory.class)
public interface IZUUlClientService {

    @RequestMapping("/forward-api/product-proxy/product/get/{id}")
    public Product getProduct(@PathVariable("id")long id);

    @RequestMapping("/forward-api/product-proxy/product/list")
    public List<Product> listProduct() ;

    @RequestMapping("/forward-api/product-proxy/product/add")
    public boolean addPorduct(Product product) ;

    @RequestMapping("/forward-api/users-proxy/users/get/{name}")
    public Users getUsers(@PathVariable("name")String name);
}
