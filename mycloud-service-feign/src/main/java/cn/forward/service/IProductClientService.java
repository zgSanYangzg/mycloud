package cn.forward.service;

import cn.forward.entity.Product;
import cn.forward.fallback.IProductClientServiceFallbackFactory;
import cn.forward.feign.FeignClientConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "MYCLOUD-PROVIDER-PRODUCT",
        configuration = FeignClientConfig.class,
fallbackFactory = IProductClientServiceFallbackFactory.class)
public interface IProductClientService {
    @RequestMapping("/prodcut/get/{id}")
    public Product getProduct(@PathVariable("id") long id);

    @RequestMapping("/prodcut/list")
    public List<Product> listProduct();

    @RequestMapping("/prodcut/add")
    public boolean addPorduct(Product product);

}
