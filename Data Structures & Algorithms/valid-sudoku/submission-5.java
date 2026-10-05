class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Map<Integer, Integer>> columns = new HashMap();
        
        int length = 9;
        for (int i = 0; i < length; i++) {
            Map<Integer, Integer> numbersCount = new HashMap();
            for (int j = 0; j < length; j++) {
                int value = board[i][j] - '0';
                Map<Integer, Integer> columnCount = columns.containsKey(j) ? columns.get(j) : new HashMap();
                if (value != -2) {
                    int updated_count =
                        numbersCount.containsKey(value) ? numbersCount.get(value) + 1 : 1;
                    int column_updated_count = columnCount.containsKey(value) ? columnCount.get(value) + 1 : 1;
                    if (updated_count > 1 || column_updated_count > 1) {
                        return false;
                    }
                    numbersCount.put(value, updated_count);
                    columnCount.put(value,column_updated_count);
                    columns.put(j, columnCount);
                }
            }
        }

        // box 1
        Map<Integer, Integer> numbersCount = new HashMap();
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                int value = board[i][j] - '0';
                if (value != -2) {
                    int updated_count =
                        numbersCount.containsKey(value) ? numbersCount.get(value) + 1 : 1;
                    if (updated_count > 1) {
                        return false;
                    }
                    numbersCount.put(value, updated_count);
                }
            }
        }

        // box 2
        numbersCount = new HashMap();
        for (int i = 0; i <= 2; i++) {
            for (int j = 3; j <= 5; j++) {
                int value = board[i][j] - '0';
                if (value != -2) {
                    int updated_count =
                        numbersCount.containsKey(value) ? numbersCount.get(value) + 1 : 1;
                    if (updated_count > 1) {
                        return false;
                    }
                    numbersCount.put(value, updated_count);
                }
            }
        }

        // box 3
        numbersCount = new HashMap();
        for (int i = 0; i <= 2; i++) {
            for (int j = 6; j <= 8; j++) {
                int value = board[i][j] - '0';
                if (value != -2) {
                    int updated_count =
                        numbersCount.containsKey(value) ? numbersCount.get(value) + 1 : 1;
                    if (updated_count > 1) {
                        return false;
                    }
                    numbersCount.put(value, updated_count);
                }
            }
        }

        // box 4
        numbersCount = new HashMap();
        for (int i = 3; i <= 5; i++) {
            for (int j = 0; j <= 2; j++) {
                int value = board[i][j] - '0';
                if (value != -2) {
                    int updated_count =
                        numbersCount.containsKey(value) ? numbersCount.get(value) + 1 : 1;
                    if (updated_count > 1) {
                        return false;
                    }
                    numbersCount.put(value, updated_count);
                }
            }
        }

        // box 5
        numbersCount = new HashMap();
        for (int i = 3; i <= 5; i++) {
            for (int j = 3; j <= 5; j++) {
                int value = board[i][j] - '0';
                if (value != -2) {
                    int updated_count =
                        numbersCount.containsKey(value) ? numbersCount.get(value) + 1 : 1;
                    if (updated_count > 1) {
                        return false;
                    }
                    numbersCount.put(value, updated_count);
                }
            }
        }

        // box 6
        numbersCount = new HashMap();
        for (int i = 3; i <= 5; i++) {
            for (int j = 6; j <= 8; j++) {
                int value = board[i][j] - '0';
                if (value != -2) {
                    int updated_count =
                        numbersCount.containsKey(value) ? numbersCount.get(value) + 1 : 1;
                    if (updated_count > 1) {
                        return false;
                    }
                    numbersCount.put(value, updated_count);
                }
            }
        }

        // box 7
        numbersCount = new HashMap();
        for (int i = 6; i <= 8; i++) {
            for (int j = 0; j <= 2; j++) {
                int value = board[i][j] - '0';
                if (value != -2) {
                    int updated_count =
                        numbersCount.containsKey(value) ? numbersCount.get(value) + 1 : 1;
                    if (updated_count > 1) {
                        return false;
                    }
                    numbersCount.put(value, updated_count);
                }
            }
        }

        // box 8
        numbersCount = new HashMap();
        for (int i = 6; i <= 8; i++) {
            for (int j = 3; j <= 5; j++) {
                int value = board[i][j] - '0';
                if (value != -2) {
                    int updated_count =
                        numbersCount.containsKey(value) ? numbersCount.get(value) + 1 : 1;
                    if (updated_count > 1) {
                        return false;
                    }
                    numbersCount.put(value, updated_count);
                }
            }
        }

        // box 9
        numbersCount = new HashMap();
        for (int i = 6; i <= 8; i++) {
            for (int j = 6; j <= 8; j++) {
                int value = board[i][j] - '0';
                if (value != -2) {
                    int updated_count =
                        numbersCount.containsKey(value) ? numbersCount.get(value) + 1 : 1;
                    if (updated_count > 1) {
                        return false;
                    }
                    numbersCount.put(value, updated_count);
                }
            }
        }
    

        return true;
    }
}
