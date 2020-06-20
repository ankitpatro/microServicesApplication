package com.abhiani.project.microServicesProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MicroServiceController {

    @RequestMapping(value   =   "/index")
    public  String  index()  {   return  "index"; }

    @RequestMapping(value   =   "/login")
    public  String  login()  {   return  "login"; }

    @RequestMapping(value   =   "/register")
    public  String  register()  {   return  "register"; }

    @RequestMapping(value   =   "/blog")
    public  String  blog()  {   return  "blog"; }

    @RequestMapping(value   =   "/blog-details")
    public  String  blogdetails()  {   return  "blog-details"; }

    @RequestMapping(value   =   "/check-out")
    public  String  checkout()  {   return  "check-out"; }

    @RequestMapping(value   =   "/contact")
    public  String  contact()  {   return  "contact"; }

    @RequestMapping(value   =   "/faq")
    public  String  faq()  {   return  "faq"; }

    @RequestMapping(value   =   "/product")
    public  String  product()  {   return  "product"; }

    @RequestMapping(value   =   "/shop")
    public  String  shop()  {   return  "shop"; }

    @RequestMapping(value   =   "/shopping-cart")
    public  String  shoppingcart()  {   return  "shopping-cart"; }

}
