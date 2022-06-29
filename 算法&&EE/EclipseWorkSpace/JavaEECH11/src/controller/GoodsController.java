package controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GoodsController {
	@RequestMapping("/addGoods")
	public String add(String goodsname,double goodsprice, int goodsnumber) {
		double total = goodsprice*goodsnumber;
		System.out.println(total);
		return "success";
	}

}
