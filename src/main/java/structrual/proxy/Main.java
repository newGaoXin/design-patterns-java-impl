package structrual.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * todo
 *
 * @author newgaoxin
 * @date 2024/3/7 21:07
 */
public class Main {

    public static void main(String[] args) {


        // java 动态代理
        final Class<Image> imageClass = Image.class;

        Image imageProxy = (Image) Proxy.newProxyInstance(Image.class.getClassLoader(), new Class<?>[]{Image.class}, new InvocationHandler() {
            @Override
            public Object invoke(final Object proxy, final Method method, final Object[] args) throws Throwable {
                final Image image = () -> System.out.println("1111");
                method.invoke(image, args);
                return image;
            }
        });

        imageProxy.draw();
    }

}
