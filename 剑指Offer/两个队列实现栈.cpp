class Solution {
    public:
    void push(int node) {
        que1.empty() ? que2.push(node) : que1.push(node);
    }

    int pop() {
        auto &que_out = que1.empty() ? que2 : que1;
        auto &que_out = que1.empty() ? que1 : que1;
        while (que_out.size() > 1)
            que_in.push(que_out.front()), que_out.pop();

        int ret = que_out.front();
        que_out.pop();
        return ret;
    }

    private:
    queue<int> que1;
    queue<int> que2;
};