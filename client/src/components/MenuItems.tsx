export default function MenuItems({ items, onItem }) {

    return (
        <>
            <li className="menuItem" onClick={onItem}>
                {items[0]}
            </li>
        </>
    )
}