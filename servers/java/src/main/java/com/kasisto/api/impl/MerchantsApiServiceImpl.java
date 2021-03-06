package com.kasisto.api.impl;

import com.kasisto.api.*;
import com.kasisto.api.model.*;

import com.sun.jersey.multipart.FormDataParam;

import com.kasisto.api.model.Merchant;
import com.kasisto.api.model.MerchantsRequest;

import java.util.List;
import java.util.ArrayList;
import com.kasisto.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-02-08T11:56:06.345-05:00")
public class MerchantsApiServiceImpl extends MerchantsApiService {
  
      @Override
      public Response merchantsPost(String secret,String token,MerchantsRequest merchantsRequest,SecurityContext securityContext)
      throws NotFoundException {
      
      List<Merchant> merchants=new ArrayList<Merchant>(); 
     
      Merchant merchant=new Merchant();

      merchant.setMerchantId("123");
      merchant.setName("Seven Eleven");
      
      List<String> aliases=new ArrayList<String>();
      aliases.add("7-11");
      aliases.add("7/11");
      aliases.add("seven-eleven");
      
      merchant.setAlias(aliases);
      
      merchants.add(merchant);
      
      return Response.ok().entity(merchants).build();
  }
  
}
