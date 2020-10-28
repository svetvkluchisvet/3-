package com.company;
import java.util.*;
  class TimeTest {

public int addList(List list, int size){
        Date start = new Date();
        for (int i = 0; i < size; i++) {
           list.add(i);
        }
        Date end = new Date();
        return (int) (end.getTime() - start.getTime());

        }

public int getList(List list, int size){
         Date start = new Date();
         for (int i = 0; i < size; i++) {
             int a = (int) list.get(i);
         }
         Date end = new Date();
         return (int) (end.getTime() - start.getTime());
     }

public int removeList(List list, int size){
        Date start = new Date();
        for (int i = size - 1; i >= 0; i--) {
           list.remove(i);
        }
        Date end = new Date();
        return (int) (end.getTime() - start.getTime());
        }

 }