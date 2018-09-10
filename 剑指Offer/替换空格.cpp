class Solution {
    public:
    void replaceSpace(char *str, int length) {
        int cnt = 0;
        int i = length - 1;
        for (int i = 0; i < length; cnt += (str[i++] == ' '));
        str = (char*)realloc(str, length += 2 * cnt);
        for (int j = length - 1; i >= 0; i--) {
            if (str[i] != ' ')
                str[j--] = str[i];
            else
                str[j] = '0', str[j-1] = '2', str[j-2] = '%', j -= 3;
        }
    }
};