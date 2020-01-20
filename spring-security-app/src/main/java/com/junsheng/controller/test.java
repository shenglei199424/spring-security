package com.junsheng.controller;

import java.util.Arrays;
/**
 * @Description 研报权限添加
 * @author shenglei
 * @date 2020/1/17 17:23
 */
public class test {
    public static void main(String[] args) {
      String [] array =  new String []{"张锋","李澄清","张伟锋","张伟","蔡毓伟","尉磊","罗霄","陈婍婷","谭鹏万","丁振国","刚登峰","韩冬","胡晓","李竞","李响","钱思佳","谢佩静","周云","林鹏"};
      String [] array1 =  new String []{"张锋","王焯","李澄清","张伟锋","唐亮","张伟","李天","汤旭人","蔡毓伟","尉磊","虞圳劬","毛鼎","叶倩","赵君妍","罗霄","陈婍婷","陈太中","刘可欣","解婕","谭鹏万","胡怀瑾","孙梦瑶","丁振国","廖晶晶","刘中群","张艳","刚登峰","韩冬","胡晓","李竞","李响","钱思佳","谢佩静","周云","林鹏"};
      String [] arrays = new String []{"李响","谢佩静","唐亮","李天","李澄清","汤旭人","蔡毓伟","张艳","王焯","虞圳劬","罗霄","张伟锋","叶倩","陈太中","廖晶晶","孙梦瑶","赵君妍","刘可欣","胡怀瑾","陈婍婷","解婕","毛鼎","刘中群","胡晓"};
        Arrays.asList(arrays).stream().filter(x->{
            boolean flag ;
            if (Arrays.asList(array1).stream().anyMatch(y->y.equals(x))){
                flag= false;
            }else {
                flag= true;
            }
            return  flag;
        }).forEach(System.out::println);
    }
}
