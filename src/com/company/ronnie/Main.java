package com.company.ronnie;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
//        enumPractice();
//
//        streamVsArraysStream();

//        arrayListObjectPractise();

//        arrayListStringPractice();

//        stackAsListStringPractice();

//        stackStandaloneStringPractice();

//        dequeStringPractice();

        Main temp = new Main();
        temp.genericsAndHashmapPractice();

        hashmapPractice();

    }

    private static void hashmapPractice() {
        HashMap<Integer, String> integerStringHashMap = new HashMap<>();

        integerStringHashMap.put(1,"ronnie");
        integerStringHashMap.put(2,"is");
        integerStringHashMap.put(3,"xavier");
        String string  = integerStringHashMap.get(1);
        System.out.println(string);
        System.out.println(integerStringHashMap);

    }

    private void genericsAndHashmapPractice() {
        MyGeneric<String> stringMyGeneric= new MyGeneric<>();
        stringMyGeneric.setT("Hellod");
        System.out.println(stringMyGeneric.getT());

        MyGeneric myGeneric = new MyGeneric();
        myGeneric.setT(1);
        myGeneric.setT("Hello");

        NonGeneric nonGeneric = new NonGeneric();
        nonGeneric.setT(1);
        nonGeneric.setT("Hello");

        HashMap<Integer, MyGeneric> integerStringHashMap = new HashMap<>();
        integerStringHashMap.put(1,myGeneric);
        System.out.println(integerStringHashMap);
    }

    public class MyGeneric<L> {
        private L t;
        public L getT() { return t; }
        public void setT(L t) {  this.t = t;  }
    }

    public class NonGeneric {
        private Object t;
        public Object getT() { return t; }
        public void setT(Object t) {  this.t = t;  }
    }

    private static void dequeStringPractice() {
        Deque<String> stringDeque = new LinkedList<>();
        stringDeque.add("first");
        stringDeque.add("second");
        stringDeque.add("third");
        stringDeque.add("fourth");
        stringDeque.addFirst("zero");
        stringDeque.addLast("fifth");
        System.out.println("polling the queue " + stringDeque.poll());
        System.out.println("polling the queue " + stringDeque.pollLast());
        System.out.println(" the queue " + stringDeque);

    }

    private static void stackStandaloneStringPractice() {
        Stack<String> stringStack = new Stack<>();
        stringStack.push("initial");
        stringStack.push("then next 1");
        stringStack.push("then next 2");
        stringStack.push("then next 3");
        System.out.println("position of 2 is " + stringStack.indexOf("then next 2"));
        System.out.println("position of 2 is " + stringStack.search("then next 2"));
        System.out.println("top peek is " + stringStack.peek());
        System.out.println("top peek popped is " + stringStack.pop());
        System.out.println("new top peek is " + stringStack.peek());
        System.out.println("whether the stack is empty? " + stringStack.isEmpty());

    }

    private static void stackAsListStringPractice() {
        Stack<String> stringStack = new Stack<>();
        stringStack.add("first");
        stringStack.add("second");
        stringStack.add("third");
        stringStack.add("fourth");
        stringStack.remove("first");
        System.out.println(stringStack);
    }

    private static void arrayListStringPractice() {
        ArrayList<String> stringArrayList= new ArrayList<>();
        stringArrayList.add("ronnie1");
        stringArrayList.add("anju1");
        stringArrayList.add("ronnie2");
        stringArrayList.add("anju2");
        stringArrayList.remove("ronnie2");
        stringArrayList.remove(0);
        stringArrayList.add("ronnie3");
        stringArrayList.add("anju3");
        stringArrayList.add("ronnie4");
        stringArrayList.add("anju4");
        stringArrayList.remove("ronnie2");
        System.out.println(stringArrayList);
        System.out.println(stringArrayList.contains("anju"));
        System.out.println(stringArrayList.indexOf("anju2"));

        practiceArrayIteration(stringArrayList);
    }

    private static void practiceArrayIteration(ArrayList<String> stringArrayList) {
        for(int i = 0; i< stringArrayList.size(); i++) {
            System.out.println("stringArrayList at index " + i +  " is " + stringArrayList.get(i));
        }
        System.out.println("\nusing differnt form of for\n");
        for (String str: stringArrayList) {
            System.out.println("stringArrayList at index " + stringArrayList.indexOf(str) +  " is " + str);
        }
        System.out.println("\nusing iterator \n");
        ListIterator itr = stringArrayList.listIterator();
        System.out.println(" " + itr.next());
        System.out.println(" " + itr.next());
        System.out.println(" " + itr.next());
        System.out.println(" " + itr.previous());
        System.out.println(" " + itr.previous());
        System.out.println(" " + itr.previous());

    }

    private static void arrayListObjectPractise() {
        MySimpleObjects mySimpleObjects = new MySimpleObjects(30,"ronnie",'d');

        ArrayList<Object> objectArrayList = new ArrayList<>();
        objectArrayList.add("ronnie1");
        objectArrayList.add("anju1");
        objectArrayList.add("ronnie2");
        objectArrayList.add("anju2");
        objectArrayList.add(mySimpleObjects);
        objectArrayList.remove("anju2");
        objectArrayList.remove(0);

        objectArrayList.add(0,1);
        System.out.println(objectArrayList);
        System.out.println(objectArrayList.get(0).getClass());
        System.out.println(objectArrayList.get(3).getClass());

        MySimpleObjects listObjectItem = (MySimpleObjects)objectArrayList.get(3);

        System.out.println(listObjectItem.getAge());
    }

    private static void streamVsArraysStream() {
        MySimpleObjects[] arrayMySimpleObjects = new MySimpleObjects[3];
        arrayMySimpleObjects[0] = new MySimpleObjects(2,"hello",'3');
        arrayMySimpleObjects[1] = new MySimpleObjects(3,"hlo",'3');
        arrayMySimpleObjects[1] = new MySimpleObjects(6,"lo",'3');
        System.out.println("Testing arry stream vs stream of");
        System.out.println(Arrays.stream(arrayMySimpleObjects).collect(Collectors.toList()));
        System.out.println(Stream.of(arrayMySimpleObjects).collect(Collectors.toList()));
    }

    private static void enumPractice() {
        System.out.println("Start enums ");

        GymDays firstGymDay = GymDays.Monday;
        System.out.println("first day of gym is " + firstGymDay);

        //below prints out Monday, Tuesday...
        for(GymDays gymDay : GymDays.values())
            System.out.println( gymDay );

        WorkDays bestWorkDay = WorkDays.MON;

        //below prints MON
        System.out.println("best work day is " + bestWorkDay);

        //below prints MON
        System.out.println("best work day is (same as above, but using name() " + bestWorkDay.name());

        //below prints Monday
        System.out.println("best work day full name is " + bestWorkDay.dayFullName());

        //below prints MON, TUE, WED ...
        System.out.println("the days are");
        for(WorkDays workDay : WorkDays.values())
            System.out.println( workDay );

        System.out.println("MAP of Workdays" + WorkDays.getAllWorkDays());
        System.out.println("finding an enum from string " + WorkDays.valueOf("MON"));
    }
}
