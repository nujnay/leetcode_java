##HashMap结构
###第一步是提出问题
1. hashmap的结构什么样的
2. 其他的语言有hashmap吗
###直观的查看HashMap的结构
1. 如果是Android系统可以直接使用Profiler Dump Java Heap 就可以看到，
2. 组成结构 hashmap的子类的Node的数组 一共是16的长度 第一位 和 第二位是字符串1和2的node
3. 什么字符串"1"的key的hash是49呢为什么被放到的第一个位置呢
4. hashmap的红黑树是怎么实现的
5. (h = key.hashCode()) ^ (h >>> 16) 是什么 >>> 叫什么 有什么效果