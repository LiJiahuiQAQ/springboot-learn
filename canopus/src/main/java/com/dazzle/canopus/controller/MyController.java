package com.dazzle.canopus.controller;

import com.dazzle.canopus.entity.Address;
import io.swagger.annotations.*;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@Api(description = "地址接口")
@RestController
@RequestMapping("/address")
public class MyController {

    private Log log = LogFactory.getLog(MyController.class);

    @ApiOperation(value = "新增地址" ,  notes="add a address")
    @RequestMapping(value="/createAddress",method=RequestMethod.POST,consumes= MediaType.APPLICATION_JSON_VALUE)
    public String  createAddress(@RequestBody Address address){
        if(log.isTraceEnabled()){
            log.trace("新增了一个地址");
        }
        return  "添加了一个地址";
    }

    @ApiOperation(value = "修改地址" ,  notes="update a address")
    @RequestMapping(value="/updateAddress",method=RequestMethod.PUT,consumes= MediaType.APPLICATION_JSON_VALUE)
    public String  updateAddress(@RequestBody Address address){
        if(log.isTraceEnabled()){
            log.trace("修改了一个地址");
        }
        return "修改了一个地址";
    }

    @ApiOperation(value = "删除地址" ,  notes="delete a address")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "addressId", value = "地址标示" ,required = true, paramType = "query", dataType = "String")
    })
    @RequestMapping(value="/deleteAddress",method=RequestMethod.DELETE)
    public String deleteAddress(@RequestParam("addressId") String addressId){

        if(log.isTraceEnabled()){
            log.trace("删除了一个地址");
        }
        return "删除了一个地址";
    }

    @ApiOperation(value = "查询地址" ,  notes="get a address")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "addressId", value = "地址标识", required = true, paramType = "query", dataType = "String")
    })
    @RequestMapping(value="/getAddress",method=RequestMethod.GET)
    public Address queryAddress(@RequestParam("addressId") String addressId){
        if(log.isTraceEnabled()){
            log.trace("查询到了一个地址");
        }
        return  new Address();
    }

}
