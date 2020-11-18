package dom4j;

import java.io.File;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

public class Test001 {
	public static void main(String[] args) throws Exception {
		// 1.创建一个解析器
		SAXReader reader = new SAXReader();
		//2.得到一个Document对象
		Document document = reader.read(new File("src/dom4j/school.xml"));
		
		Node node = document.selectSingleNode("/学校");
		System.out.println(node.getName());
//		System.out.println(node.getText());
		
		Node node2=document.selectSingleNode("/学校/班级");
		System.out.println(node2.getName());
		System.out.println(node2.getText());
		
		// 3.进行CRUD操作
		//得到根节点
//		Element rootElement = document.getRootElement();
		//1.得到指定的节点内容
		//get1(rootElement);
		//2.得到所有的节点
//		get2(rootElement);
		
		
		
	}
	//2.得到所有的节点
	public static void get2(Element rootElement) {
		List<Element> list = rootElement.elements();
		
		for (Element element : list) {
			List<Element> list2 = element.elements();
			
			for (Element element2 :list2) {
				List<Element> element3 = element2.elements();
				for (Element element4 : element3) {
					System.out.println(element4.getName());
					System.out.println(element4.getText());
					
					String str = element3.get(1).getText();
					System.out.println(str);
				
				}
				
			}
		}
	}
}
