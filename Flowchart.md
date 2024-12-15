# Flowchart for Vehicle Information Input

1. **Start**: Begin the flowchart.
2. **Input jenis kendaraan**: Prompt the user to input the type of vehicle.
3. **Check jenis kendaraan**:
   - If "mobil", add Rp200,000 to total tariff.
   - If "motor", add Rp100,000 to total tariff.
4. **Input tahun pembuatan kendaraan**: Prompt the user to input the year of manufacture of the vehicle.
5. **Check tahun pembuatan kendaraan**:
   - If the vehicle is older than 10 years, add Rp50,000 to total tariff.
6. **Input usia pengemudi**: Prompt the user to input the age of the driver.
7. **Check usia pengemudi**:
   - If the driver is younger than 25 years, add Rp100,000 to total tariff.
8. **Input riwayat kecelakaan**: Prompt the user to input whether they have a history of accidents.
9. **Check riwayat kecelakaan**:
   - If "ya", add Rp150,000 to total tariff.
10. **Output total tarif**: Display the total tariff.
11. **End**: End the flowchart.

## Textual Representation

```
Start
  |
  v
Input jenis kendaraan
  |
  v
Check jenis kendaraan
  |       |
  v       v
mobil   motor
  |       |
  v       v
Add Rp200,000  Add Rp100,000
  |
  v
Input tahun pembuatan kendaraan
  |
  v
Check tahun pembuatan kendaraan
  |       |
  v       v
> 10 years  <= 10 years
  |       |
  v       v
Add Rp50,000  No additional charge
  |
  v
Input usia pengemudi
  |
  v
Check usia pengemudi
  |       |
  v       v
< 25 years  >= 25 years
  |       |
  v       v
Add Rp100,000  No additional charge
  |
  v
Input riwayat kecelakaan
  |
  v
Check riwayat kecelakaan
  |       |
  v       v
ya      tidak
  |       |
  v       v
Add Rp150,000  No additional charge
  |
  v
Output total tarif
  |
  v
End
