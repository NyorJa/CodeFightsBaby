boolean checkPalindrome(String inputString) {
        StringBuffer rev = new StringBuffer(inputString).reverse();
        String strRev = rev.toString();
        return inputString.equalsIgnoreCase(strRev);
}
