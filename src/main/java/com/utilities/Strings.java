package com.utilities;

import java.util.regex.Pattern;

public class Strings {
   private Strings() {
   }

   public static boolean matchesPattern(String value, String regex) {
      var pattern = Pattern.compile(regex);
      var matcher = pattern.matcher(value);

      return matcher.matches();
   }

   public static boolean stringContains(StringBuilder line, Character ch) {
      return line.indexOf(ch.toString()) > -1;
   }
}