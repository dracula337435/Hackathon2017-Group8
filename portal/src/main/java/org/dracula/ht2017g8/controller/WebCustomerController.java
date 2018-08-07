package org.dracula.ht2017g8.controller;

import org.dracula.ht2017g8.bo.CommonBO;
import org.dracula.ht2017g8.bo.ReturnCodeAndMsg;
import org.dracula.ht2017g8.bo.WebCustomerBO;
import org.dracula.ht2017g8.service.WebCustomerService;
import org.dracula.ht2017g8.vo.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dk
 */
@RestController
public class WebCustomerController {

    @Autowired
    private WebCustomerService webCustomerService;

    @RequestMapping(value="/web_customer/{custId}", method= RequestMethod.GET)
    public CommonBO<WebCustomerVO> getByCustId(@PathVariable("custId") String custId){
        CommonBO<WebCustomerBO> customerBOCommonBO = webCustomerService.getByCustId(custId);
        CommonBO<WebCustomerVO> rslt = new CommonBO<>();
        if(customerBOCommonBO != null){
            if(ReturnCodeAndMsg.SUCCESS.getCode().equals(customerBOCommonBO.getCode())){
                WebCustomerBO webCustomerBO = customerBOCommonBO.getData();
                WebCustomer_SticknessVO sticknessVO = new WebCustomer_SticknessVO();
                BeanUtils.copyProperties(webCustomerBO, sticknessVO);
                WebCustomer_PotentialVO potentialVO = new WebCustomer_PotentialVO();
                BeanUtils.copyProperties(webCustomerBO, potentialVO);
                WebCustomer_LoyaltyVO loyaltyVO = new WebCustomer_LoyaltyVO();
                BeanUtils.copyProperties(webCustomerBO, loyaltyVO);
                WebCustomer_LevelVO levelVO = new WebCustomer_LevelVO();
                BeanUtils.copyProperties(webCustomerBO, levelVO);
                WebCustomer_BaseVO baseVO = new WebCustomer_BaseVO();
                BeanUtils.copyProperties(webCustomerBO, baseVO);
                WebCustomerVO webCustomerVO = new WebCustomerVO();
                webCustomerVO.setBase(baseVO);
                webCustomerVO.setLevel(levelVO);
                webCustomerVO.setLoyalty(loyaltyVO);
                webCustomerVO.setPotential(potentialVO);
                webCustomerVO.setStickness(sticknessVO);
                rslt.setData(webCustomerVO);
                rslt.setCodeAndMsg(ReturnCodeAndMsg.SUCCESS);
            }else{
                rslt.setMsg(customerBOCommonBO.getMsg());
                rslt.setCode(customerBOCommonBO.getCode());
            }
            return rslt;
        }else{
            rslt.setCodeAndMsg(ReturnCodeAndMsg.FAIL_00007);
            return rslt;
        }
    }

    @RequestMapping(value="/web_customer/{custId}/complete_info", method= RequestMethod.GET)
    public CommonBO<WebCustomerBO> getByCustIdCompleteInfo(@PathVariable("custId") String custId){
        CommonBO<WebCustomerBO> customerBOCommonBO = webCustomerService.getByCustId(custId);
        if(customerBOCommonBO != null){
            return customerBOCommonBO;
        }else{
            customerBOCommonBO.setCodeAndMsg(ReturnCodeAndMsg.FAIL_00018);
            return customerBOCommonBO;
        }
    }

}
