package com.xcrj.offersa.pass3;
/**
 * 剑指 Offer II 020. 回文子字符串的个数
 * - 具有不同开始位置或结束位置的子串，即使是由相同的字符组成，也会被视作不同的子串。
 * - 字符串由小写字母构成
 */
public class Solution20 {
    /**
     * 双指针奇偶拓展
     * i是回文中心
     * 奇拓展 l=0,r=0,i=0
     * 偶拓展 l=0,r=1,i=1
     * 奇拓展 l=1,r=1,i=2
     * 偶拓展 l=1,r=2,i=3
     * ...
     * 偶拓展 l=n-2,r=n-1,i=2*n-2
     * 奇拓展 l=n-1,r=n-1,i=2*n-1
     * 
     * 规律，
     * l=下取整i/2
     * r=l+i%2
     * @param s
     * @return
     */
    public int countSubstrings(String s) {
        int cnt=0;
        for(int i=0;i<2*s.length()-1;i++){
            int l=i/2;
            int r=l+i%2;
            while(l>=0&&r<s.length()&&s.charAt(l)==s.charAt(r)){
                // 中心拓展一次，产生一个新的回文串
                cnt++;
                l--;
                r++;
            }
        }
        return cnt;
    }
}
