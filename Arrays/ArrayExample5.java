// Example 5
        System.out.println("\n===== Example 5: Minimum =====");
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println("Minimum = " + min);
