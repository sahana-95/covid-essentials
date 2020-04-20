package com.cts.essentialsneeds;

import com.cts.essentialsneeds.model.Item;
import com.cts.essentialsneeds.model.Store;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/storeCon")
public class StoreController {

    @RequestMapping(value = "/displayStores" , method = RequestMethod.POST)
    public String displayStores(@RequestParam(value = "needType", required = true)String keyword, Model model)
            throws IOException {

        List<Store> storeList = new ArrayList<>();
        List<Item> itemList = new ArrayList<>();
        Item item1, item2;
        Store store1, store2;

        switch (keyword)
        {
            case "medicine":
                item1 = new Item("paracetamol", 10);
                itemList.add(item1);
                item2 = new Item("vicks", 5);
                itemList.add(item2);
                store1 = new Store("Medical Store", itemList);
                storeList.add(store1);
                item1 = new Item("sinarest", 15);
                itemList = new ArrayList<>();
                itemList.add(item1);
                item2 = new Item("zyncet", 25);
                itemList.add(item2);
                store2 = new Store("Model Medical Store", itemList);
                storeList.add(store2);
                break;

            case "vegetable":
                item1 = new Item("potato", 50);
                itemList.add(item1);
                item2 = new Item("tomato", 30);
                itemList.add(item2);
                store1 = new Store("Green vegetable", itemList);
                storeList.add(store1);
                item1 = new Item("tomato", 25);
                itemList = new ArrayList<>();
                itemList.add(item1);
                item2 = new Item("cabbage", 25);
                itemList.add(item2);
                store2 = new Store("All Vegetable", itemList);
                storeList.add(store2);
                break;

            case "grocery":
                item1 = new Item("oil", 200);
                itemList.add(item1);
                item2 = new Item("rice", 60);
                itemList.add(item2);
                store1 = new Store("General store", itemList);
                storeList.add(store1);
                item1 = new Item("wheat floor", 50);
                itemList = new ArrayList<>();
                itemList.add(item1);
                item2 = new Item("ghee", 500);
                itemList.add(item2);
                store2 = new Store("Capital store", itemList);
                storeList.add(store2);
                break;


        }
        model.addAttribute("storeList", storeList);
    return "/storeDetails";

    }


}
