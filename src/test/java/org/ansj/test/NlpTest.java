package org.ansj.test;

import java.io.IOException;
import java.util.List;
import java.util.Map.Entry;

import love.cq.util.IOUtil;

import org.ansj.dic.LearnTool;
import org.ansj.splitWord.analysis.NlpAnalysis;
import org.ansj.splitWord.analysis.ToAnalysis;

public class NlpTest {
	public static void main(String[] args) throws IOException {
//	    LearnTool learn = new LearnTool() ;
//        NlpAnalysis nlpAnalysis = new NlpAnalysis(IOUtil.getReader("/Users/ansj/Documents/workspace/ElasticSearchServer/sub_test.txt", IOUtil.UTF8), learn) ;
//        while(nlpAnalysis.next()!=null){}
//        List<Entry<String, Double>> topTree = learn.getTopTree(20) ;
//        System.out.println(topTree);
		System.out.println(ToAnalysis.parse("奥地利、比利时和大不列颠及北爱尔兰联合王报告向低收入家庭提供取暖和更方便使用电力的"));
	}
}
