export default function Menu({ list }) {

    return (
        <ul className='headerMenu ta-center w-100'>
            {list.map((item, index) => (
                <li key={index} className='cursor-pointer'>{item}</li>
            ))}
        </ul>
    );
}