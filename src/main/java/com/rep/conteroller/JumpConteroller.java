package com.rep.conteroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JumpConteroller {
    @RequestMapping("")
    public String login() {
        return "login1";
    }

    @RequestMapping("footer")
    public String footer() {
        return "html/footer";
    }

    @RequestMapping("index")
    public String index() {
        return "html/index";
    }

    @RequestMapping("left")
    public String left() {
        return "html/left";
    }

    @RequestMapping("main")
    public String main() {
        return "html/main";
    }

    @RequestMapping("tools")
    public String tools() {
        return "html/tools";
    }

    @RequestMapping("top")
    public String top() {
        return "html/top";
    }

    /*marker/customer*/
    @RequestMapping("customerAdd")
    public String customerAdd() {
        return "html/market/customer/customerAdd";
    }

    @RequestMapping("customerList")
    public String customerList() {
        return "html/market/customer/customerList";
    }

    @RequestMapping("customerUpdate")
    public String customerUpdate() {
        return "html/market/customer/customerUpdate";
    }

    @RequestMapping("customerView")
    public String customerView() {
        return "html/market/customer/customerView";
    }

    @RequestMapping("customerApproval")
    public String customerApproval() {
        return "html/market/customer/customerApproval";
    }

    /*marker/customerBrowse*/
    @RequestMapping("customerBrowse")
    public String customerBrowse() {
        return "html/market/customerBrowse/customerBrowse";
    }

    /*marker/order*/
    @RequestMapping("orderAdd")
    public String orderAdd() {
        return "html/market/order/orderAdd";
    }

    @RequestMapping("orderList")
    public String orderList() {
        return "html/market/order/orderList";
    }

    @RequestMapping("orderUpdate")
    public String orderUpdate() {
        return "html/market/order/orderUpdate";
    }

    @RequestMapping("orderView")
    public String orderView() {
        return "html/market/order/orderView";
    }

    /*marker/orderExamine*/
    @RequestMapping("orderExamine")
    public String orderExamine() {
        return "html/market/orderExamine/orderExamine";
    }

    @RequestMapping("orderExamineList")
    public String orderExamineList() {
        return "html/market/orderExamine/orderExamineList";
    }

    /*purchase/brand*/
    @RequestMapping("brandAdd")
    public String brandAdd() {
        return "html/purchase/brand/brandAdd";
    }

    @RequestMapping("brandList")
    public String brandList() {
        return "html/purchase/brand/brandList";
    }

    @RequestMapping("brandUpdate")
    public String brandUpdate() {
        return "html/purchase/brand/brandUpdate";
    }

    /*purchase/manufacturer*/
    @RequestMapping("manufacturerAdd")
    public String manufacturerAdd() {
        return "html/purchase/manufacturer/manufacturerAdd";
    }

    @RequestMapping("manufacturerList")
    public String manufacturerList() {
        return "html/purchase/manufacturer/manufacturerList";
    }

    @RequestMapping("manufacturerUpdate")
    public String manufacturerUpdate() {
        return "html/purchase/manufacturer/manufacturerUpdate";
    }

    @RequestMapping("manufacturerView")
    public String manufacturerView() {
        return "html/purchase/manufacturer/manufacturerView";
    }

    /*purchase/product*/
    @RequestMapping("productAdd")
    public String productAdd() {
        return "html/purchase/product/productAdd";
    }

    @RequestMapping("productList")
    public String productList() {
        return "html/purchase/product/productList";
    }

    @RequestMapping("productUpdate")
    public String productUpdate() {
        return "html/purchase/product/productUpdate";
    }

    /*purchase/productType*/
    @RequestMapping("productTypeAdd")
    public String productTypeAdd() {
        return "html/purchase/productType/productTypeAdd";
    }

    @RequestMapping("productTypeList")
    public String productTypeList() {
        return "html/purchase/productType/productTypeList";
    }

    @RequestMapping("productTypeUpdate")
    public String productTypeUpdate() {
        return "html/purchase/productType/productTypeUpdate";
    }

    /*purchase/purchase*/
    @RequestMapping("purchaseAdd")
    public String purchaseAdd() {
        return "html/purchase/purchase/purchaseAdd";
    }

    @RequestMapping("purchaseList")
    public String purchaseList() {
        return "html/purchase/purchase/purchaseList";
    }

    @RequestMapping("purchaseUpdate")
    public String purchaseUpdate() {
        return "html/purchase/purchase/purchaseUpdate";
    }

    @RequestMapping("purchaseView")
    public String purchaseView() {
        return "html/purchase/purchase/purchaseView";
    }

    /*purchase/purchaseExamine*/
    @RequestMapping("purchaseExamine")
    public String purchaseExamine() {
        return "html/purchase/purchaseExamine/purchaseExamine";
    }

    @RequestMapping("purchaseExamineList")
    public String purchaseExamineList() {
        return "html/purchase/purchaseExamine/purchaseExamineList";
    }

    /*statis/delivery*/
    @RequestMapping("deliveryStatis")
    public String deliveryStatis() {
        return "html/statis/delivery/deliveryStatis";
    }

    @RequestMapping("deliveryView")
    public String deliveryView() {
        return "html/statis/delivery/deliveryView";
    }

    /*statis/purchase*/
    @RequestMapping("purchaseStatis")
    public String purchaseStatis() {
        return "html/statis/purchase/purchaseStatis";
    }

    @RequestMapping("stapurchaseView")
    public String stapurchaseView() {
        return "html/statis/purchase/purchaseView";
    }

    /*statis/sales*/
    @RequestMapping("salesStatis")
    public String salesStatis() {
        return "html/statis/sales/salesStatis";
    }

    @RequestMapping("salesView")
    public String salesView() {
        return "html/statis/sales/salesView";
    }

    /*statis/stock*/
    @RequestMapping("stockStatis")
    public String stockStatis() {
        return "html/statis/stock/stockStatis";
    }

    @RequestMapping("stockView")
    public String stockView() {
        return "html/statis/stock/stockView";
    }

    /*storage/delivery*/
    @RequestMapping("deliveryAdd")
    public String deliveryAdd() {
        return "html/storage/delivery/deliveryAdd";
    }

    @RequestMapping("deliveryList")
    public String deliveryList() {
        return "html/storage/delivery/deliveryList";
    }

    @RequestMapping("stordeliveryView")
    public String stordeliveryView() {
        return "html/storage/delivery/deliveryView";
    }

    /*storage/inventory*/
    @RequestMapping("inventoryList")
    public String inventoryList() {
        return "html/storage/inventory/inventoryList";
    }

    /*storage/stock*/
    @RequestMapping("stockAdd")
    public String stockAdd() {
        return "html/storage/stock/stockAdd";
    }

    @RequestMapping("stockList")
    public String stockList() {
        return "html/storage/stock/stockList";
    }

    @RequestMapping("ststockView")
    public String ststockView() {
        return "html/storage/stock/stockView";
    }

    /*storage/stock*/
    @RequestMapping("storageAdd")
    public String storageAdd() {
        return "html/storage/storage/storageAdd";
    }

    @RequestMapping("storageList")
    public String storageList() {
        return "html/storage/storage/storageList";
    }

    @RequestMapping("storageUpdate")
    public String storageUpdate() {
        return "html/storage/storage/storageUpdate";
    }

    @RequestMapping("storageView")
    public String storageView() {
        return "html/storage/storage/storageView";
    }

    /*storage/storageBrowse*/
    @RequestMapping("storageBrowse")
    public String storageBrowse() {
        return "html/storage/storageBrowse/storageBrowse";
    }

    /*storage/storageBrowse*/
    @RequestMapping("areaList")
    public String areaList() {
        return "html/sys/area/areaList";
    }

    /*storage/dept*/
    @RequestMapping("deptAdd")
    public String deptAdd() {
        return "html/sys/dept/deptAdd";
    }

    @RequestMapping("deptList")
    public String deptList() {
        return "html/sys/dept/deptList";
    }

    @RequestMapping("deptUpdate")
    public String deptUpdate() {
        return "html/sys/dept/deptUpdate";
    }

    @RequestMapping("positionAdd")
    public String positionAdd() {
        return "html/sys/dept/positionAdd";
    }

    @RequestMapping("positionGrant")
    public String positionGrant() {
        return "html/sys/dept/positionGrant";
    }

    @RequestMapping("positionList")
    public String positionList() {
        return "html/sys/dept/positionList";
    }

    @RequestMapping("positionUpdate")
    public String positionUpdate() {
        return "html/sys/dept/positionUpdate";
    }

    /*storage/logs*/
    @RequestMapping("logList")
    public String logList() {
        return "html/sys/logs/logList";
    }

    @RequestMapping("logView")
    public String logView() {
        return "html/sys/logs/logView";
    }

    /*storage/modules*/
    @RequestMapping("moduleAdd")
    public String moduleAdd() {
        return "html/sys/modules/moduleAdd";
    }

    @RequestMapping("moduleList")
    public String moduleList() {
        return "html/sys/modules/moduleList";
    }

    @RequestMapping("moduleUpdate")
    public String moduleUpdate() {
        return "html/sys/modules/moduleUpdate";
    }

    @RequestMapping("moduleView")
    public String moduleView() {
        return "html/sys/modules/moduleView";
    }

    /*storage/users*/
    @RequestMapping("userAdd")
    public String userAdd() {
        return "html/sys/users/userAdd";
    }

    @RequestMapping("userList")
    public String userList() {
        return "html/sys/users/userList";
    }

    @RequestMapping("userUpdate")
    public String userUpdate() {
        return "html/sys/users/userUpdate";
    }

    @RequestMapping("userView")
    public String userView() {
        return "html/sys/users/userView";
    }
}
