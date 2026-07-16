// Example 4
        System.out.println("\n===== Example 4: Maximum =====");
        int[] arr = {15, 22, 7, 98, 35};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println("Maximum = " + max);
