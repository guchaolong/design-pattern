/**
 * <p>
 * For more information about , welcome to http://www.guchaolong.com
 * <p>
 * project: design-pattern
 * <p>
 * Revision History:
 * Date          Version       Name            Description
 * 2019/1/18 1.0          guchaolong          Creation File
 */
package com.gcl.designpattern.no3_behavioral_pattern.no3_iterator;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2019/1/18 0:01
 */
public class Tv implements ITV {
    private String[] obj = {"cctv1", "cctv2", "cctv3"};

    @Override
    public IIterator getIterator() {
        return new MyIterator();
    }

    public class MyIterator implements IIterator {
        private int currentIndex = 0;
        @Override
        public boolean isFirst() {
            return currentIndex == 0;

        }

        @Override
        public boolean isLast() {
            return currentIndex == obj.length;
        }

        @Override
        public Object current() {
            return obj[currentIndex];
        }

        @Override
        public void previous() {
            if(currentIndex>0){
                currentIndex--;
            }

        }

        @Override
        public void next() {

            if(currentIndex<obj.length)
                currentIndex++;
        }
    }
}