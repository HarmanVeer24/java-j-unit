package com.bridgeLabz.testing;
import com.bridgeLabz.basicTesting.ListManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ListManagerTesting {
    @Test
    public void shouldAddElementToList(){
        ListManager listManager = new ListManager();
        ArrayList<Integer> list = new ArrayList<>();
        listManager.addElement(list,3);
        Assertions.assertEquals(1,list.size());
        Assertions.assertTrue(list.contains((3)));
    }
    @Test
    public void shouldRemoveElementFromList(){
        ListManager listManager = new ListManager();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        ListManager.removeElement(list,0);
        Assertions.assertEquals(0,list.size());
        Assertions.assertFalse(list.contains(5));
    }
    @Test
    public void shouldGetSizeOfList(){
        ListManager listManager = new ListManager();
        ArrayList<Integer> list = new ArrayList<>();
        ListManager.getSize(list);
        Assertions.assertEquals(0,list.size());
    }
}
