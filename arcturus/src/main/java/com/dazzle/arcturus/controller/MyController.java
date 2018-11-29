package com.dazzle.arcturus.controller;
;
import com.dazzle.arcturus.entity.Order;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@Api(description = "订单接口")
@RestController
@RequestMapping("/order")
public class MyController {

    private Log log = LogFactory.getLog(MyController.class);

    @ApiOperation(value = "新增订单" ,  notes="add a order")
    @RequestMapping(value="/createOrder",method=RequestMethod.POST,consumes= MediaType.APPLICATION_JSON_VALUE)
    public String  createUser(@RequestBody Order order){
        if(log.isTraceEnabled()){
            log.trace("新增了一个订单");
        }
        return  "添加了一个订单";
    }

    @ApiOperation(value = "修改订单" ,  notes="update a order")
    @RequestMapping(value="/updateOrder",method=RequestMethod.PUT,consumes= MediaType.APPLICATION_JSON_VALUE)
    public String  updateUser(@RequestBody Order order){
        if(log.isTraceEnabled()){
            log.trace("修改了一个订单");
        }
        return "修改了一个订单";
    }

    @ApiOperation(value = "删除订单" ,  notes="delete a order")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "orderId", value = "订单标示" ,required = true, paramType = "query", dataType = "String")
    })
    @RequestMapping(value="/deleteOrder",method=RequestMethod.DELETE)
    public String deleteUser(@RequestParam("orderId") String orderId){

        if(log.isTraceEnabled()){
            log.trace("删除了一个订单");
        }
        return "删除了一个订单";
    }

    @ApiOperation(value = "查询订单" ,  notes="get a address")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "orderId", value = "订单标识", required = true, paramType = "query", dataType = "String")
    })
    @RequestMapping(value="/getOrder",method=RequestMethod.GET)
    public Order queryOrder(@RequestParam("orderId") String orderId){
        if(log.isTraceEnabled()){
            log.trace("查询到了一个订单");
        }
        return new Order();
    }

}
