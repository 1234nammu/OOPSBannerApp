public class OOPSBanner{
	      public static class Banner{
              map.put('O', new String[]{
                " * ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " * "
        });
        map.put('O', new String[]{
                " * ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " * "
        });
          }
           map.put('P', new String[]{
                "** ",
                "*   *",
                "*   *",
                "** ",
                "*    ",
                "*    ",
                "*    "
        });
  map.put('P', new String[]{
                "** ",
                "*   *",
                "*   *",
                "** ",
                "*    ",
                "*    ",
                "*    "
        });  map.put('S', new String[]{
                " **",
                "*    ",
                "*    ",
                " * ",
                "    *",
                "    *",
                "** "
        });

        return map;
    }
  for (int row = 0; row < rows; row++) {
            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                String[] pattern = patternMap.get(ch);
                if (pattern != null) {
                    line.append(pattern[row]).append("  ");
                }
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        Map<Character, String[]> patternMap = buildPatternMap();
        renderBanner("OOPS", patternMap);
    }
}