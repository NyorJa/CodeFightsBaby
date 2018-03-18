int centuryFromYear(int year) {
        int a = (int) Math.floor(year / 100);
        return (year % 100 == 0) ? a : ++a;
}
