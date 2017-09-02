boolean isCryptSolution(String[] crypt, char[][] solution) {
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < solution.length; j++) crypt[i] = crypt[i].replaceAll(solution[j][0] + "", solution[j][1] + "");
        if (crypt[i].charAt(0) == '0' && crypt[i].length() > 1) return false;
    }
    try {
        if ((Double.parseDouble(crypt[0]) + Double.parseDouble(crypt[1]) == Double.parseDouble(crypt[2]))) {
            return true;
        }
    } catch (NumberFormatException c) {
        return false;
    }
    return false;
}