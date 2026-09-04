import pandas as pd

def meltTable(df: pd.DataFrame) -> pd.DataFrame:
  return df.melt(
    id_vars=["product"],
    value_vars=[f"quarter_{i}" for i in range(1, 5)],
    var_name="quarter",
    value_name="sales"
  )