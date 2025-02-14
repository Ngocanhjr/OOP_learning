

import com.myctu.ct108h_thuchanh.Buoi2.Bai3.PhanSo;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PhanSoTest {

    @Test
    void testConstructor() {
        PhanSo ps1 = new PhanSo();
        PhanSo ps2 = new PhanSo(3, 7);

        assertNotNull(ps1);
        assertNotNull(ps2);
    }

    @Test
    void testNghichDao() {
        PhanSo ps = new PhanSo(3, 4);
        ps.nghichDao();
        assertEquals(4, ps.getTu());
        assertEquals(3, ps.getMau());
    }

    @Test
    void testGiaTriNghichDao() {
        PhanSo ps = new PhanSo(3, 4);
        PhanSo inverse = ps.giaTriNghichDao();
        assertEquals(4, inverse.getTu());
        assertEquals(3, inverse.getMau());
    }

    @Test
    void testGiaTriThuc() {
        PhanSo ps = new PhanSo(1, 2);
        assertEquals(0.5, ps.giaTriThuc(), 0.0001);
    }

    @Test
    void testLonHon() {
        PhanSo ps1 = new PhanSo(3, 4);
        PhanSo ps2 = new PhanSo(1, 2);
        assertTrue(ps1.lonHon(ps2));
        assertFalse(ps2.lonHon(ps1));
    }

    @Test
    void testCongPhanSo() {
        PhanSo ps1 = new PhanSo(1, 3);
        PhanSo ps2 = new PhanSo(1, 6);
        PhanSo result = ps1.congPS(ps2);

        assertDoesNotThrow(() -> result.hienThi());
    }

    @Test
    void testCongSoNguyen() {
        PhanSo ps = new PhanSo(1, 3);
        PhanSo result = ps.congPSNguyen(2);

        assertDoesNotThrow(() -> result.hienThi());
    }
}
