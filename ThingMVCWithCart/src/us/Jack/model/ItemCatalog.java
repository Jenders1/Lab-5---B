package us.Jack.model;

import java.util.ArrayList;
import java.util.List;

public class ItemCatalog {
    private List<Item> itemCatalog = new ArrayList<>();
    private int nextProductNumber;

    public ItemCatalog() {
        nextProductNumber = 1;
        itemCatalog.add(new Item(nextProductNumber++,"Item 1",1.0,true,"Its a thing","C:\\Users\\bitstudent\\Desktop\\SampleMVCWithCart\\web\\images\\image1.jpg"));
        itemCatalog.add(new Item(nextProductNumber++,"Item 2",2.0,false,"Its another thing","C:\\Users\\bitstudent\\Desktop\\SampleMVCWithCart\\web\\images\\image2.png"));
        itemCatalog.add(new Item(nextProductNumber++,"Item 3",3.0,true,"Its yet another thing","C:\\Users\\bitstudent\\Desktop\\SampleMVCWithCart\\web\\images\\image3.png"));
    }

    public List<Item> getItemCatalog() {
        return itemCatalog;
    }

    public List<Item> getFeaturedItemCatalog() {
        List<Item> item = new ArrayList<>();

        for(Item i: itemCatalog) {
            if (i.isFeatured()) {
                item.add(i);
            }
        }
        return item;
    }
    public Item getSingleItem(int itemNum) {
        Item item=null;

        for(Item i: itemCatalog) {
            if (i.getProductNumer() == itemNum) {
                return i;
            }
        }
        return item;
    }
}
