package com.javarush.Level_Core_19;
import java.util.HashMap;
import java.util.Map;

public class Sol_19_2 {
    public static Map<String, String> countries = new HashMap<String, String>();

    static {
        countries.put("UA" , "Ukraine");
        countries.put("RU" , "Russia");
        countries.put("CA" , "Canada");
    }

    public static void main(String[] args) {

    }

    public static class IncomeDataAdapter implements Customer,Contact{
        private IncomeData data;

        public IncomeDataAdapter(IncomeData incomeData) {
            this.data = incomeData;
        }

        @Override
        public String getCompanyName() {
            return data.getCompany();
        }

        @Override
        public String getCountryName() {
              return countries.get(data.getCountryCode());
        }

        @Override
        public String getName() {
            return data.getContactLastName() + ", " + data.getContactFirstName();
        }

        @Override
        public String getPhoneNumber() {
           String s = String.format("%010d" , data.getPhoneNumber());
           return "+" + data.getCountryPhoneCode() + "(" + s.substring(0,3) + ")" +s.substring(3,6) + "-" + s.substring(6,8) + "-" + s.substring(8,10);
        }
    }


    public static interface IncomeData {
        String getCountryCode(); //For example: UA

        String getCompany(); //For example: JavaRush Ltd.

        String getContactFirstName(); //For example: Ivan

        String getContactLastName(); //For example: Ivanov

        int getCountryPhoneCode(); //For example: 38

        int getPhoneNumber(); //For example: 501234567
    }

    public static interface Customer {
        String getCompanyName(); //For example: JavaRush Ltd.

        String getCountryName(); //For example: Ukraine
    }

    public static interface Contact {
        String getName(); //For example: Ivanov, Ivan

        String getPhoneNumber(); //For example: +38(050)123-45-67
    }
}