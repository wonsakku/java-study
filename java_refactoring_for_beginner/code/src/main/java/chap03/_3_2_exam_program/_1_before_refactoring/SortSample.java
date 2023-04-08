package chap03._3_2_exam_program._1_before_refactoring;

import java.util.Arrays;

public class SortSample {

    private final int[] _data;

    public SortSample(int[] data) {
        this._data = data;
        System.arraycopy(data, 0, _data, 0, data.length);
    }

    public void sort() {
        for (int x = 0; x < _data.length - 1; x++) {
            int m = x;
            for (int y = x + 1; y < _data.length; y++) {
                if (_data[m] > _data[y]) {
                    m = y;
                }
            }

            // 여기서 _data[m]은 _data[x] ~ _data[_data.length - 1]의 최소값이어야 함
            int v = _data[m];
            _data[m] = _data[x];
            _data[x] = v;
            // 여기서 _data[0] ~ _data[x+1]은 이미 정렬되어 있어야 함
        }
    }

    @Override
    public String toString() {
        return  Arrays.toString(_data);
    }
}
